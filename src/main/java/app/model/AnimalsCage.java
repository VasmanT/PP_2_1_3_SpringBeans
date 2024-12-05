package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;

    @Autowired
    private Timer timer;//это поле класса AmimalsCage. Cпринг создал объект типа timer, указали чтобы он сюда подтянулся

    public Timer getTimer() { // метод возвращает какой то объект типа Timer
        return timer; // возвращаем поле timer класса An...Cage
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());// вызываем метод getTime
        System.out.println("________________________");
    }
}
