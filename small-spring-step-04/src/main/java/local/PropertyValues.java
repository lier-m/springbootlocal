package local;

import local.PropertyValue;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lijing
 * @version 1.0
 * @since 2023-01-14 17:52
 */
public class PropertyValues {

    private List<PropertyValue> propertyValueList = new ArrayList<>();

    public List<PropertyValue> getPropertyValueList() {
        return propertyValueList;
    }

    public void setPropertyValueList(List<PropertyValue> propertyValueList) {
        this.propertyValueList = propertyValueList;
    }

    public void addPropertyValue(PropertyValue propertyValue){
        propertyValueList.add(propertyValue);
    }
    public PropertyValue getPropertyValue(String propertyName){
        for(PropertyValue pv : this.propertyValueList){
            if(pv.getName().equals(propertyName)){
                return pv;
            }
        }
        return null;
    }
}
