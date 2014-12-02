/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classbean;

/**
 *
 * @author Mamin
 */
public class OtherMaintenance extends Maintenance{
    private float cost;
    private String desc;
    private int ID;
    private String mType;

    /**
     * @return the cost
     */
    public float getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(float cost) {
        this.cost = cost;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the mType
     */
    public String getmType() {
        return mType;
    }

    /**
     * @param mType the mType to set
     */
    public void setmType(String mType) {
        this.mType = mType;
    }
    
    
}
