package edu.ytu.nerdle.core.util.string;

import javax.swing.*;
import java.util.ArrayList;

public class StringUtil {
    public static String arrayListToString(ArrayList<JPanel> list) {
        String str = "";
        for (JPanel jPanel : list) {
            str += ((JLabel)jPanel.getComponent(0)).getText();
        }
        return str;
    }
}
