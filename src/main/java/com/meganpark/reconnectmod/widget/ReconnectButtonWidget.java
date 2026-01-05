package com.meganpark.reconnectmod.widget;

import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.MutableText;

public class ReconnectButtonWidget{

    public static ButtonWidget build(int x, int y, int width, int height, MutableText message, ButtonWidget.PressAction onPress, ButtonWidget.NarrationSupplier narrationSupplier) {
        return new ButtonWidget.Builder(message, onPress).position(x, y).size(width, height).narrationSupplier(narrationSupplier).build();
    }

}
