#include <Servo.h>
Servo myservo; 

int max_angle = 80;
int min_angle = 100;

int minutos = 5; //min
int comecar_ligacao = 30; //s


void setup()
{
  myservo.attach(6);  // attaches the servo on pin 9 to the servo object

  myservo.write(min_angle);
  delay(3000);
}

void loop ()
{
  fazer_ligacao(); //para fazer ligação
  delay(1000*comecar_ligacao);
  fazer_ligacao(); //para desligar ligação
  
  delay(1000*60*minutos);
}


void fazer_ligacao()
{
  myservo.write(max_angle);
  delay(1000);
  myservo.write(min_angle);
  delay(100);
}
