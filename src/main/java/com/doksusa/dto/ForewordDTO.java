package com.doksusa.dto;

public class ForewordDTO {
	
	String foreword;

	   public ForewordDTO() {
	      super();
	   }

	   public ForewordDTO(String foreword) {
	      super();
	      this.foreword = foreword;
	   }

	   public String getForeword() {
	      return foreword;
	   }

	   public void setForeword(String foreword) {
	      this.foreword = foreword;
	   }

	   @Override
	   public String toString() {
	      return "ForewordDTO [foreword=" + foreword + "]";
	   }

}
