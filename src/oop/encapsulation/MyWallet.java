package oop.encapsulation;

public class MyWallet {
    // Class fields
    private double balance = 0.0; // по умолчанию баланс 0
    private String pincode;
    private int incorAttempts = 0; // считает неправильные вводы пинкода
    // Check
    private boolean isValidPin(String pin) {
        // 1. отсев всех случаев когда длина не равна 4
        if (pin.length() != 4)
            return false;
        // 2. Проверка, что пин-код - число
        for (int i = 0; i < 4; i++) {
            char c = pin.charAt(i);
            if (c < '0' || c > '9')
                return false;
        }
        // 3. если никуда не зашли, то введеный пин-код число
        return true;
    }
    // Constructor
    MyWallet(String pincode) {
        if (isValidPin(pincode))
            this.pincode = pincode;
        else {
            this.pincode = "0000";
            System.out.println("Установлен ПИН-код по умолчанию." +
                    "ПИН-код должен содержать цифры от 0 до 9 длиной в 4 символа!");
        }
    }
    // Method 1:
    public void setPin(String old_pincode, String new_pincode) {
        if (this.pincode.equals(old_pincode) && isValidPin(new_pincode)) {
            incorAttempts = 0;
            this.pincode = new_pincode;
            System.out.println("ПИН-код изменён успешно!");
        }
        else {
            incorAttempts += 1;
            System.out.println("Ошибка в изменении ПИН-кода! Осталось попыток: " + (3- incorAttempts));
        }

    }
    // Method 2:
    public void deposit(double amount, String pincode) {
        if (amount > 0 && this.pincode.equals(pincode)) {
            incorAttempts = 0;
            balance += amount;
            System.out.printf("Баланс был пополнен на %.2f рублей. Текущий баланс: %.2f \n", amount, this.balance);
        }
        else if (amount <= 0)
            System.out.println("Сумма должна быть больше 0!");
        else {
            incorAttempts += 1;
            System.out.println("Ошибка в изменении ПИН-кода! Осталось попыток: " + (3 - incorAttempts));
        }
    }
    // Method 3:
    public void withdraw(double amount, String inputPin) {
        if (this.pincode.equals(inputPin) && amount <= this.balance && amount > 0) {
            incorAttempts = 0;
            this.balance -= amount;
            System.out.printf("Снято: %.2f рублей. Текущий баланс: %.2f \n", amount, this.balance);
        }
        else if (amount <= 0)
            System.out.println("Сумма должна быть больше 0!");
        else if (!this.pincode.equals(inputPin)) {
            incorAttempts += 1;
            System.out.println("Ошибка в изменении ПИН-кода! Осталось попыток: " + (3 - incorAttempts));
        }

        else if (amount > balance)
            System.out.println("Недостаточно средств!");
    }
    // Method 4:
    public void checkBalance(String inputPin) {
        if (this.pincode.equals(inputPin)) {
            incorAttempts = 0;
            System.out.printf("Баланс: %.2f \n", this.balance);
        }
        else {
            incorAttempts += 1;
            System.out.println("Ошибка в изменении ПИН-кода! Осталось попыток: " + (3 - incorAttempts));
        }
    }

    public static void main(String[] args) {
        System.out.println("Тестируем класс MyWallet основанный на инкапсуляции! \n");

        // 1. Создаем кошелёк
        MyWallet wallet = new MyWallet("2934");

        // 2. Вносим деньги в кошелёк
        wallet.deposit(40293.5, "2934");
        wallet.deposit(28471.35, "2934");
        wallet.deposit(253, "2934");

        // 3. Проверяем баланс кошелька
        wallet.checkBalance("2934");

        // 4. Снимаем деньги
        wallet.withdraw(29341.2, "2934");
        // Пробуем снять отрицательное число денег :D
        wallet.withdraw(-15, "2934");
        // Пробуем неправильно ввести ПИН-код
        wallet.withdraw(245, "2954");

        // 5. Меняем пароль
        wallet.setPin("2934", "8214");
        wallet.checkBalance("2934"); // ОШИБКА))
        wallet.checkBalance("8214"); // нормис
        // Попробуем неправильный pincode ввести
        wallet.setPin("8214", "303");
        // пинкод не меняется если мы ввели неправильный пин-код когда пытались изменить)
        wallet.withdraw(500, "8214");
    }
}
