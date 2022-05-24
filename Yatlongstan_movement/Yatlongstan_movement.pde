// Yatlongstan (Yat Long Chan, Gabriel Thompson, Weichen Liu)
// APCS
// HW105 -- 'Tis Hard to Search for 'Processing'
// 2022-05-23
// time spent: 0.5 hrs

int x = 50;
int y = 50;

void setup() {
  size(600, 600);
}

void draw() {
  background(0);
  ellipse(x, y, 30, 30); 
}
void keyPressed() {
  if (key == CODED) {
    if (keyCode == UP) {
      y -= 5;
    } else if (keyCode == DOWN) {
      y += 5;
    } else if (keyCode == LEFT) {
      x -= 5;
    } else if (keyCode == RIGHT) {
      x += 5; 
    }
  }
}
