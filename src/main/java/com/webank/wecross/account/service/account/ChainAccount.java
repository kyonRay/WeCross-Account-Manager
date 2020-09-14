package com.webank.wecross.account.service.account;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.webank.wecross.account.service.db.ChainAccountTableBean;
import lombok.Builder;
import lombok.Data;

public class ChainAccount {
    private Integer id;
    protected String username; // ua
    protected Integer keyID;
    protected String type;
    protected boolean isDefault;
    protected String pubKey;
    protected String secKey;
    protected String UAProof;
    protected String ext0;
    protected String ext1;
    protected String ext2;
    protected String ext3;

    @JsonIgnore
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getKeyID() {
        return keyID;
    }

    public void setKeyID(Integer keyID) {
        this.keyID = keyID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @JsonGetter("isDefault")
    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }

    @JsonIgnore
    public String getUAProof() {
        return UAProof;
    }

    public void setUAProof(String UAProof) {
        this.UAProof = UAProof;
    }

    public ChainAccountTableBean toTableBean() {
        ChainAccountTableBean tableBean = new ChainAccountTableBean();
        tableBean.setId(id);
        tableBean.setUsername(username);
        tableBean.setKeyID(keyID);
        tableBean.setType(type);
        tableBean.setDefault(isDefault);
        tableBean.setPub(pubKey);
        tableBean.setSec(secKey);
        tableBean.setUAProof(UAProof);
        tableBean.setExt0(ext0);
        tableBean.setExt1(ext1);
        tableBean.setExt2(ext2);
        tableBean.setExt3(ext3);
        return tableBean;
    }

    @Data
    @Builder
    public static class Details {
        protected String username; // ua
        protected Integer keyID;
        protected String type;
        protected boolean isDefault;
        protected String pubKey;
        protected String secKey;
        protected String UAProof;
        protected String ext0;
        protected String ext1;
        protected String ext2;
        protected String ext3;
    }

    public Details toDetails() {
        return Details.builder()
                .username(username)
                .keyID(keyID)
                .type(type)
                .isDefault(isDefault)
                .pubKey(pubKey)
                .secKey(secKey)
                .UAProof(UAProof)
                .ext0(ext0)
                .ext1(ext1)
                .ext2(ext2)
                .ext3(ext3)
                .build();
    }

    @JsonIgnore
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
