package com.doksusa.dto;

public class IpsiInfoDTO {

	
	String university;
	   String link;

	   public IpsiInfoDTO() {
	      super();
	   }

	   public IpsiInfoDTO(String university, String link) {
	      super();
	      this.university = university;
	      this.link = link;
	   }

	   public String getUniversity() {
	      return university;
	   }

	   public void setUniversity(String university) {
	      this.university = university;
	   }

	   public String getLink() {
	      return link;
	   }

	   public void setLink(String link) {
	      this.link = link;
	   }

	   @Override
	   public String toString() {
	      return "IpsiInfoDTO [university=" + university + ", link=" + link + "]";
	   }
	
	
}
