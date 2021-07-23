/*
  Copyright 2021 Conway
  Licensed under the GNU General Public License v3.0 (GPL-3.0-only).
  This is free software with NO WARRANTY etc. etc.,
  see LICENSE or <https://www.gnu.org/licenses/>.
*/

package io.github.yawnoc.utilities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.provider.Settings;
import android.view.inputmethod.InputMethodManager;

public final class Contexty {
  
  private Contexty() {
    // Do not instantiate
  }
  
  public static String loadPreferenceString(
    final Context context,
    final String preferenceFileName,
    final String preferenceKey
  )
  {
    SharedPreferences preferences =
      context.getSharedPreferences(preferenceFileName, Context.MODE_PRIVATE);
    
    return preferences.getString(preferenceKey, null);
  }
  
  public static void savePreferenceString(
    final Context context,
    final String preferenceFileName,
    final String preferenceKey,
    final String preferenceValue
  )
  {
    SharedPreferences preferences =
      context.getSharedPreferences(preferenceFileName, Context.MODE_PRIVATE);
    
    SharedPreferences.Editor preferencesEditor = preferences.edit();
    preferencesEditor.putString(preferenceKey, preferenceValue);
    preferencesEditor.apply();
  }
  
  public static void showSystemInputMethodSettings(final Context context) {
    
    final Intent inputMethodSettingsIntent =
      new Intent(Settings.ACTION_INPUT_METHOD_SETTINGS);
    
    context.startActivity(inputMethodSettingsIntent);
  }
  
  public static void showSystemKeyboardSwitcher(final Context context) {
    
    final InputMethodManager inputMethodManager =
      (InputMethodManager)
        context.getSystemService(Context.INPUT_METHOD_SERVICE);
    
    inputMethodManager.showInputMethodPicker();
  }
  
  public static void openInBrowser(final Context context, final String uri) {
    
    final Intent browserIntent =
      new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
    
    context.startActivity(browserIntent);
  }
  
  public static void launchApplication(
    final Context context,
    final String packageName
  )
  {
    final Intent launchIntent =
      context.getPackageManager().getLaunchIntentForPackage(packageName);
    
    if (launchIntent != null) {
      context.startActivity(launchIntent);
    }
  }
  
}
