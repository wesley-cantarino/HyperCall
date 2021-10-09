#include <Servo.h>

Servo myservo; 

void setup() {
  myservo.attach(6);  // attaches the servo on pin 9 to the servo object
}

void loop() {
  myservo.write(70);
  delay(1000);
  myservo.write(90);
  delay(2000);

  myservo.write(70);
  delay(1000);
  myservo.write(90);
  delay(2000);
}
