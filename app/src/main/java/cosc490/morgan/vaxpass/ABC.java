package cosc490.morgan.vaxpass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ABC extends AppCompatActivity {

    int x = 0;
    int y = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}