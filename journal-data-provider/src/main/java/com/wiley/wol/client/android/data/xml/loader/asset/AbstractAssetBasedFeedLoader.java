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
package com.wiley.wol.client.android.data.xml.loader.asset;

import android.content.Context;
import android.content.res.AssetManager;
import com.google.inject.Inject;

import java.io.IOException;
import java.io.InputStream;

public abstract class AbstractAssetBasedFeedLoader {
    @Inject
    private Context context;

    protected final AssetManager getAssetManager(){
        return context.getAssets();
    }

    protected final InputStream doLoadInternal(final String path) throws IOException {
        return getAssetManager().open(path);
    }
}
