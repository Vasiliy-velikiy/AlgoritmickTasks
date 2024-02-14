package yandex.taskThree;

//робот умеет ходить двумя ногами. У него есть левая нога и правая.
// Отдельный класс Foot описывает конкретную ногу
// Есть метод step() который вызываться в методе run() бесконечно
// в psvm запускаються 2 потока который бесконечно ходят
//ножно сделать так чтобы в консоль попеременно выводилось left затем right
//доп вопрос: как оптимизировать если будет сороконожка, как сделать так что ноги ходили друг за другом
//ответ:currentLeg - отображает значение от 0 до 39  и в проверку добавляеться -точно ли текущая нога должна сходить, - засыпаем,
// если она уже походила то notifyAll для всех ног которые спят

public class Robot {
    public static void main(String[] args) {
        Thread one = new Thread(new Foot("left"));
        Thread two = new Thread(new Foot("right"));

        one.start();
        two.start();
    }
}
