package cat.sala.mih;

import cat.sala.mih.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
	
	private WebView mWebView;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 mWebView = (WebView) findViewById(R.id.activity_main_webview);
		// Activamos Javascript
		        WebSettings webSettings = mWebView.getSettings();
		        webSettings.setJavaScriptEnabled(true);
		// Url que carga la app (webview)
		     //   mWebView.loadUrl("C:\\Users\\Jeopt\\Desktop\\CFGS DAM\\M8\\Activitat5_jqueryMobile_mod02\\index03.html");
		        mWebView.loadUrl("file:///android_asset/index.html");
		        // Forzamos el webview para que abra los enlaces internos dentro de la la APP
		        mWebView.setWebViewClient(new WebViewClient());
		// Forzamos el webview para que abra los enlaces externos en el navegador
		        mWebView.setWebViewClient(new MyAppWebViewClient());
		        
		  
	}
	
	 @Override
	// Detectar cuando se presiona el botón de retroceso
	    public void onBackPressed() {
	        if(mWebView.canGoBack()) {
	            mWebView.goBack();
	        } else {
	            super.onBackPressed();
	        }
	    }


	  /*  @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	        getMenuInflater().inflate(R.menu.menu_main, menu);
	        return true;
	    }

	    @Override
	    public boolean onOptionsItemSelected(MenuItem item) {
	        // Handle action bar item clicks here. The action bar will
	        // automatically handle clicks on the Home/Up button, so long
	        // as you specify a parent activity in AndroidManifest.xml.
	        int id = item.getItemId();

	        //noinspection SimplifiableIfStatement
	        if (id == R.id.action_settings) {
	            return true;
	        }

	        return super.onOptionsItemSelected(item);
	    }*/
	}
