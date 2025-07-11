/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ayele
 */


import java.beans.*;

public class CaptchaPanelBeanInfo extends SimpleBeanInfo {

    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor tipoProp = new PropertyDescriptor("tipo", CaptchaPanel.class);
            PropertyDescriptor opacidadProp = new PropertyDescriptor("opacidad", CaptchaPanel.class);
            PropertyDescriptor anchoProp = new PropertyDescriptor("anchoCaptcha", CaptchaPanel.class);
            PropertyDescriptor altoProp = new PropertyDescriptor("altoCaptcha", CaptchaPanel.class);
            PropertyDescriptor longitudProp = new PropertyDescriptor("longitud", CaptchaPanel.class);

            return new PropertyDescriptor[]{
                tipoProp, opacidadProp, anchoProp, altoProp, longitudProp
            };
        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }
    }
}
