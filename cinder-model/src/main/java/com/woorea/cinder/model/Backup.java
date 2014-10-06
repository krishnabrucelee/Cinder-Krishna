
package com.woorea.cinder.model;

/**
 *
 * @author developer
 */
public class Backup {

    /**
     * 
     */
    private String create;
    /**
     * 
     */
    private String available;
    /**
     * 
     */
    private String delete;
    /**
     * 
     */
    private String error;
    /**
     * 
     */
    private String restore;
    /**
     * 
     */
    private String errorRestore;

    public String getCreate() {
        return create;
    }

    public void setCreate(String create) {
        this.create = create;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getDelete() {
        return delete;
    }

    public void setDelete(String delete) {
        this.delete = delete;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getRestore() {
        return restore;
    }

    public void setRestore(String restore) {
        this.restore = restore;
    }

    public String getErrorRestore() {
        return errorRestore;
    }

    public void setErrorRestore(String errorRestore) {
        this.errorRestore = errorRestore;
    }

    @Override
    public String toString() {
        return "Backup{" + "create=" + create + ", available=" + available + ", delete=" + delete + ", error=" + error + ", restore=" + restore + ", errorRestore=" + errorRestore + '}';
    }
    
    
}
