package com.basesoft.baseapp.Models;

import com.basesoft.baseapp.Common.Constants;

/**
 * Created by yamil.marques
 */
public class NavItemCategory extends NavDrawerItemAbs {

    public NavItemCategory(String label){
        this.type = Constants.NAV_ITEM_TYPE_CATEGORY;
        this.label = label;
    }

}
