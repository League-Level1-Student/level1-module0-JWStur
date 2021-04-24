void setup() {
size(600,600);


}

int why = 0;
int randomNumber = (int) random(600);
void draw() {
    background(200,0,0);
    fill(0, 0, 200);
    stroke(0, mouseX, mouseY);
    ellipse(randomNumber, why, 25, 50);
    why += 5;
    fill(0,0,0);
    rect(mouseX, 500, 50, 100);
    fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
    if (why == 600) {
    checkCatch(randomNumber);
    why = 0;
    randomNumber = (int) random(600);
    }
}

int score = 0;
void checkCatch(int x){
     if (x > mouseX && x < mouseX+50) {
     score++;
     }
     else if (score > 0)  {
     score--;
     }
     println("Your score is now: " + score);
     

}
