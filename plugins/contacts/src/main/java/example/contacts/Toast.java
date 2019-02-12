package example.contacts;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.app.Activity;

public class Toast extends CordovaPlugin {

//	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		if (args.length() == 0)
			return false;
		// 要输出的信息
		String message = args.getString(0);
		// 持续的时间
		String duration = args.optString(1);

		switch (action) {
		default:
			return false;
		case "makeText":
			android.widget.Toast.makeText(cordova.getActivity(), message,
					"long".equals(duration) ? android.widget.Toast.LENGTH_LONG : android.widget.Toast.LENGTH_SHORT);
		}

		return false;
	}
}
