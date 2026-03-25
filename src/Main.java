//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     //dog paper cat part
     var dog = 8.0;
     var cat = 3.6;
     var paper = 763789;
     System.out.println("dog = " + dog + " cat = " + cat + " paper = " + paper);
     dog = dog + 4;
     cat = cat + 4;
     paper = paper + 4;
     System.out.println("dog = " + dog + " cat = " + cat + " paper = " + paper);
     dog = dog - 3.5;
     cat = cat - 1.6;
     paper = paper - 7639;
     System.out.println("dog = " + dog + " cat = " + cat + " paper = " + paper);
     //friend part
     var friend = 19;
     System.out.println("friend = " + friend);
     friend = friend + 2;
     System.out.println("friend = " + friend);
     friend = friend / 7;
     System.out.println("friend = " + friend);
     //frog part
     var frog = 3.5;
     System.out.println("frog = " + frog);
     frog = frog * 10;
     System.out.println("frog = " + frog);
     frog = frog / 3.5;
     System.out.println("frog = " + frog);
     frog = frog + 4;
     System.out.println("frog = " + frog);
     //boxing part
     var firstBoxerWeightKg = 78.2;
     var secondBoxerWeightKg = 82.7;
     System.out.println("Первый боксер весит = " + firstBoxerWeightKg + " кг Второй боксер = " + secondBoxerWeightKg + " кг");
     var summOfTwoBoxers = firstBoxerWeightKg + secondBoxerWeightKg;
     System.out.println("Масса двух боксеров = " + summOfTwoBoxers + " кг");
     var weightDifference = firstBoxerWeightKg - secondBoxerWeightKg;
     System.out.println("Разница в весе = " + weightDifference + " кг");
     var modulusWeight = secondBoxerWeightKg % firstBoxerWeightKg;
     System.out.println("Остаток от деления между двумя весами = " + modulusWeight);
     //work time part точечки для верного деления
     var manHours = 640.0;
     System.out.println("Человекочасы в кампании " + manHours + " часов");
     var workTime = 8.0;
     System.out.println("Каждый работает по " + workTime + " часов");
     var workers = manHours / workTime;
     System.out.println("Всего работников в компании — " + workers + " человек");
     workers = workers + 94.0;
     workTime = manHours / workers;
     System.out.println("Если в компании работает " + workers + " человек, то всего " + workTime + " часов работы может быть поделено между сотрудниками");
     //Если без точек, тогда ответ получается по 3 часа на 174 сотрудника, а это всего 522 человеко-часов, что не верно
    }
}
