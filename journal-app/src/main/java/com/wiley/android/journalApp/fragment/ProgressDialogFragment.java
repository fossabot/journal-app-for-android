/*  Journal App for Android
 *  Copyright (C) 2019 John Wiley & Sons, Inc.
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.wiley.android.journalApp.fragment;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;

import com.wiley.android.journalApp.base.JournalDialogFragment;

public class ProgressDialogFragment extends JournalDialogFragment {

    public static ProgressDialogFragment newInstance() {
        return new ProgressDialogFragment ();
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final ProgressDialog dialog = new ProgressDialog(getActivity());
        dialog.setMessage("Loading...");
        dialog.setIndeterminate(true);
        DialogInterface.OnKeyListener keyListener = new DialogInterface.OnKeyListener() {

            @Override
            public boolean onKey(DialogInterface dialog, int keyCode,
                                 KeyEvent event) {
                if( keyCode == KeyEvent.KEYCODE_BACK){
                    return true;
                }
                return false;
            }


        };
        dialog.setOnKeyListener(keyListener);
        return dialog;
    }

}