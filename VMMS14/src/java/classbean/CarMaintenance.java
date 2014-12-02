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
public class CarMaintenance extends Maintenance{
    private int ID;
    private String op;
    private float opCost;
    private float serviceCost;
    private String sp;
    private float spCost;
    private float totalCost;

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
     * @return the op
     */
    public String getOp() {
        return op;
    }

    /**
     * @param op the op to set
     */
    public void setOp(String op) {
        this.op = op;
    }

    /**
     * @return the opCost
     */
    public float getOpCost() {
        return opCost;
    }

    /**
     * @param opCost the opCost to set
     */
    public void setOpCost(float opCost) {
        this.opCost = opCost;
    }

    /**
     * @return the serviceCost
     */
    public float getServiceCost() {
        return serviceCost;
    }

    /**
     * @param serviceCost the serviceCost to set
     */
    public void setServiceCost(float serviceCost) {
        this.serviceCost = serviceCost;
    }

    /**
     * @return the sp
     */
    public String getSp() {
        return sp;
    }

    /**
     * @param sp the sp to set
     */
    public void setSp(String sp) {
        this.sp = sp;
    }

    /**
     * @return the spCost
     */
    public float getSpCost() {
        return spCost;
    }

    /**
     * @param spCost the spCost to set
     */
    public void setSpCost(float spCost) {
        this.spCost = spCost;
    }

    /**
     * @return the totalCost
     */
    public float getTotalCost() {
        return totalCost;
    }

    /**
     * @param totalCost the totalCost to set
     */
    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }
    
    
}
