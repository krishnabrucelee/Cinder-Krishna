
package com.woorea.cinder.model;

/**
 *
 * @author developer
 */
public class QuotaSets {
    
  private String cores;

  private String fixed_ips;
  

private String floating_ips;

private String id;

private String injected_file_content_bytes;

private String  injected_file_path_bytes;

private String injected_files;

private String instances;

private String key_pairs;

private String metadata_items;

private String ram;

private String security_group_rules;

private String security_groups;

    public String getCores() {
        return cores;
    }

    public void setCores(String cores) {
        this.cores = cores;
    }

    public String getFixed_ips() {
        return fixed_ips;
    }

    public void setFixed_ips(String fixed_ips) {
        this.fixed_ips = fixed_ips;
    }

    public String getFloating_ips() {
        return floating_ips;
    }

    public void setFloating_ips(String floating_ips) {
        this.floating_ips = floating_ips;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInjected_file_content_bytes() {
        return injected_file_content_bytes;
    }

    public void setInjected_file_content_bytes(String injected_file_content_bytes) {
        this.injected_file_content_bytes = injected_file_content_bytes;
    }

    public String getInjected_file_path_bytes() {
        return injected_file_path_bytes;
    }

    public void setInjected_file_path_bytes(String injected_file_path_bytes) {
        this.injected_file_path_bytes = injected_file_path_bytes;
    }

    public String getInjected_files() {
        return injected_files;
    }

    public void setInjected_files(String injected_files) {
        this.injected_files = injected_files;
    }

    public String getInstances() {
        return instances;
    }

    public void setInstances(String instances) {
        this.instances = instances;
    }

    public String getKey_pairs() {
        return key_pairs;
    }

    public void setKey_pairs(String key_pairs) {
        this.key_pairs = key_pairs;
    }

    public String getMetadata_items() {
        return metadata_items;
    }

    public void setMetadata_items(String metadata_items) {
        this.metadata_items = metadata_items;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSecurity_group_rules() {
        return security_group_rules;
    }

    public void setSecurity_group_rules(String security_group_rules) {
        this.security_group_rules = security_group_rules;
    }

    public String getSecurity_groups() {
        return security_groups;
    }

    public void setSecurity_groups(String security_groups) {
        this.security_groups = security_groups;
    }

    @Override
    public String toString() {
        return "QuotaSets{" + "cores=" + cores + ", fixed_ips=" + fixed_ips + ", floating_ips=" + floating_ips + ", id=" + id + ", injected_file_content_bytes=" + injected_file_content_bytes + ", injected_file_path_bytes=" + injected_file_path_bytes + ", injected_files=" + injected_files + ", instances=" + instances + ", key_pairs=" + key_pairs + ", metadata_items=" + metadata_items + ", ram=" + ram + ", security_group_rules=" + security_group_rules + ", security_groups=" + security_groups + '}';
    }

    
}
