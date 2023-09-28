package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name="RedLeft", group="Auto")
//@Disabled
public class RedLeft extends LinearOpMode {

    public AutoMethods bot = new AutoMethods();





    //ОСНОВНАЯ ПРОГРАММА
    @Override
    public void runOpMode() throws InterruptedException {


        bot.initC(this);      //Инициализация
        bot.camStart(this);   //Запуск камеры
        bot.initIMU(this);//Запуск гироскопа
        bot.close();
        bot.sleep(350);
        waitForStart();
        bot.start();
        bot.getPos();

        bot.camStop();

        bot.Telescope(1600);
        bot.drive(4000, -1000, this, 4);
        bot.drive(0, -7000, this, 4);
        bot.drive(2000, -2000, this, 4);
        sleep(500);
        bot.open();
        sleep(500);
        bot.drive(0, 500, this, 1.5);//едем назад

        if (bot.baza == 1) {
            bot.Telescope(400);
            bot.drive(-5000, 0, this, 3);
        }
        if (bot.baza == 2) {

            bot.Telescope(400);
            bot.drive(-2000, 0, this, 2);

        }
        if (bot.baza == 3) {

            bot.Telescope(400);
            bot.drive(4000, 0, this, 2);
        }
    }
}