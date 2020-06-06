/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Other;

public class MyCombobox {
    
    public Object Text;
    public Object Value;

    public MyCombobox(Object text, Object value) {//constructor dung de tao doi tuong co 2 thuoc tinh gom key va value
        Text = text;
        Value = value;
    }

    @Override
    public String toString() {
        return Text.toString();
    }
}
