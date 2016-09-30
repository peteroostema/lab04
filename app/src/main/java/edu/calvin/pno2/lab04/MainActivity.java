/* Main Activity displays a set text and allows context switching to an about page
 *
 * Author: Peter Oostema
 * Date: September 30, 2016
 */
package edu.calvin.pno2.lab04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/*MainActivity sets up the layout of a textbox and a activity menu
 * it also implements the context switching to the about page
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /*onCreateOptionsMenu creates a menu for context switching
     * @param menu a menu to create a menu from
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    /* onOptionsItemSelected handles the context switching of the app
     * @param item, a MenuItem adds the ability to move to the about activity
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_about:
                startActivity(new Intent(getApplicationContext(), About.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}