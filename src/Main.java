public class Main {
    public static void main(String[] args) {

        //Задание номер 1
        byte example1 = 100;
        short example2 = 200;
        int example3 = 300;
        long example4 = 400;
        float example5 = 500.0F;
        System.out.println(example1);
        System.out.println(example2);
        System.out.println(example3);
        System.out.println(example4);
        System.out.println(example5);

        //Задание номер 2
        float boxer1 = 78.2F;
        float boxer2 = 82.7F;
        float BoxersWeight = boxer1 + boxer1;
        float BoxersDifference = boxer2 % boxer1;
        System.out.println("Вес двух бойцов составляет " + BoxersWeight + " кг");
        System.out.println("Разница в весе двух бойцов составляет " + BoxersDifference + " кг");

        //Задание номер 3
        short BananaWeight = 5 * 80;
        short MilkWeight = 105 * (200 / 100);
        short IceCreamWeight = 2 * 100;
        short Eggs = 4 * 70;
        float SumWeight = BananaWeight + MilkWeight + IceCreamWeight + Eggs;
        float KgWeight = SumWeight / 1000;
        System.out.println("Общий вес продуктов составляет " + SumWeight + "грамм" + KgWeight + " килограмм.");

        //Задание номер 4
        int ExtraKgInGrams = 7 * 1000;
        int DaysOfWeightLoss250 = ExtraKgInGrams / 250;
        int DaysOfWeightLoss500 = ExtraKgInGrams / 500;
        int AverageDays = (DaysOfWeightLoss250 + DaysOfWeightLoss250) / 2;
        System.out.println("При потери 250 грамм каждый день, процесс составит " + DaysOfWeightLoss250 + " дней");
        System.out.println("При потери 500 грамм каждый день, процесс составит " + DaysOfWeightLoss500 + " дней");
        System.out.println("В среднем понадобиться " + AverageDays + " дней");

        //Задание номер 5
        int MashaNewSalary = 67760 + ((67770 / 100) * 10);
        int DenisNewSalary = 83690 + ((83690 / 100) * 10);
        int KristinNewSalary = 76230 + ((76230 / 100) * 10);
        int MashaYearSalaryDifference = (MashaNewSalary * 12) - (67760 * 12);
        int DenisYearSalaryDifference = (DenisNewSalary * 12) - (83690 * 12);
        int KristinYearSalaryDifference = (KristinNewSalary * 12) - (76230 * 12);
        System.out.println("Новое ежемесячная зарплата Маши составляет " + MashaNewSalary + " рублей, а разница зарплаты за год составляет " + MashaYearSalaryDifference + " рублей");
        System.out.println("Новое ежемесячная зарплата Дениса составляет " + DenisNewSalary + " рублей, а разница зарплаты за год составляет " + DenisYearSalaryDifference + " рублей");
        System.out.println("Новое ежемесячная зарплата Кристины составляет " + KristinNewSalary + " рублей, а разница зарплаты за год составляет " + KristinYearSalaryDifference + " рублей");


    }
}