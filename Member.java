package org.orcid.frontend.salesforce.model;

import java.io.Serializable;
import java.net.URL;

import org.apache.commons.lang3.StringUtils;
import org.orcid.core.salesforce.model.CommunityType;
import org.orcid.frontend.salesforce.adapter.SalesForceAdapter;

/**
 * 
 * @author Will Simpson
 *
 */
public class Member implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;    
    private String ownerId;
    private String name;
    private String publicDisplayName;
    private URL websiteUrl;
    private CommunityType researchCommunity;
    private String country;
    private String description;
    private URL logoUrl;
    private String publicDisplayEmail;
    private String emailDomains;
    private String mainOpportunityPath;
    private String consortiumLeadId;
    private String lastMembershipStartDate;
    private String lastMembershipEndDate;
    private String recordTypeId;
    private Boolean isConsortiaMember;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getPublicDisplayName() {
        return StringUtils.isNotBlank(publicDisplayName) ? publicDisplayName : name;
    }

    public void setPublicDisplayName(String publicDisplayName) {
        this.publicDisplayName = publicDisplayName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URL getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(URL websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public CommunityType getResearchCommunity() {
        return researchCommunity;
    }

    public void setResearchCommunity(CommunityType researchCommunity) {
        this.researchCommunity = researchCommunity;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public URL getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(URL logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getPublicDisplayEmail() {
        return publicDisplayEmail;
    }

    public void setPublicDisplayEmail(String publicDisplayEmail) {
        this.publicDisplayEmail = publicDisplayEmail;
    }
    
    public String getEmailDomains() {
        return emailDomains;
    }

    public void setEmailDomains(String emailDomains) {
        this.emailDomains = emailDomains;
    }

    public String getMainOpportunityPath() {
        return mainOpportunityPath;
    }

    public String getMainOpportunityId() {
        return SalesForceAdapter.extractIdFromUrl(mainOpportunityPath);
    }

    public void setMainOpportunityPath(String mainOpportunityPath) {
        this.mainOpportunityPath = mainOpportunityPath;
    }

    public String getConsortiumLeadId() {
        return consortiumLeadId;
    }

    public void setConsortiumLeadId(String consortiumLeadId) {
        this.consortiumLeadId = consortiumLeadId;
    }

    public String getLastMembershipStartDate() {
        return lastMembershipStartDate;
    }

    public void setLastMembershipStartDate(String lastMembershipStartDate) {
        this.lastMembershipStartDate = lastMembershipStartDate;
    }

    public String getLastMembershipEndDate() {
        return lastMembershipEndDate;
    }

    public void setLastMembershipEndDate(String lastMembershipEndDate) {
        this.lastMembershipEndDate = lastMembershipEndDate;
    }
    
    public String getRecordTypeId() {
        return recordTypeId;
    }

    public void setRecordTypeId(String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }

    public Boolean getIsConsortiaMember() {
        return isConsortiaMember;
    }

    public void setIsConsortiaMember(Boolean isConsortiaMember) {
        this.isConsortiaMember = isConsortiaMember;
    }

    @Override
    public String toString() {
        return "Member [id=" + id + ", ownerId=" + ownerId + ", name=" + name + ", publicDisplayName=" + publicDisplayName + ", websiteUrl=" + websiteUrl
                + ", researchCommunity=" + researchCommunity + ", country=" + country + ", description=" + description + ", logoUrl=" + logoUrl + ", publicDisplayEmail="
                + publicDisplayEmail + ", emailDomains=" + emailDomains + ", mainOpportunityPath=" + mainOpportunityPath + ", consortiumLeadId=" + consortiumLeadId
                + ", lastMembershipStartDate=" + lastMembershipStartDate + ", lastMembershipEndDate=" + lastMembershipEndDate + ", recordTypeId=" + recordTypeId
                + ", isConsortiaMember=" + isConsortiaMember + "]";
    }

}
