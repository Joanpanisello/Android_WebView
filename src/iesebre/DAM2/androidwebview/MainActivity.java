package iesebre.DAM2.androidwebview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btnBoton1 = (Button)findViewById(R.id.button1);
		final WebView view = (WebView)findViewById(R.id.webView1);
		 
		btnBoton1.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View arg0)
		    {
				view.loadUrl("http://www.google.es/");
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	{
}
}
