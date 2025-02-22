package com.ashera.chip;

import com.ashera.widget.WidgetFactory;

public class ChipPlugin  {
    public static void initPlugin() {
    	//start - widgets
        WidgetFactory.register(new com.ashera.chip.ChipImpl());
        WidgetFactory.register(new com.ashera.chip.ChipGroupImpl());
        //end - widgets
    }
}
