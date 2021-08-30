package com.spring_collections;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	int questionId;
	String question;
	List<String> ansList;
	Set<String> ansSet;
	Map<Integer,String> ansMap;
	
	
	
	public int getQuestionId() {
		return questionId;
	}



	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}



	public String getQuestion() {
		return question;
	}



	public void setQuestion(String question) {
		this.question = question;
	}



	public List<String> getAnsList() {
		return ansList;
	}



	public void setAnsList(List<String> ansList) {
		this.ansList = ansList;
	}



	public Set<String> getAnsSet() {
		return ansSet;
	}



	public void setAnsSet(Set<String> ansSet) {
		this.ansSet = ansSet;
	}



	public Map<Integer, String> getAnsMap() {
		return ansMap;
	}



	public void setAnsMap(Map<Integer, String> ansMap) {
		this.ansMap = ansMap;
	}



	public void displayInfoList() {
		System.out.println("List Elements:");
		System.out.println(questionId+" "+question);
		System.out.println("Answers are:");
		Iterator<String> itr=ansList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	public void displayInfoSet() {
		System.out.println("\nSet Elements:");
		System.out.println(questionId+" "+question);
		System.out.println("Answers are:");
		Iterator<String> itr=ansSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public void displayInfoMap() {
		System.out.println("\nMap Elements:");
		System.out.println(questionId+" "+question);
		System.out.println("Answers are:");
		Set<Entry<Integer,String>> map=ansMap.entrySet();
		Iterator<Entry<Integer, String>> itr=map.iterator();
		while(itr.hasNext()) {
			Entry<Integer, String> entry=itr.next();
			System.out.println("Sequence no:"+entry.getKey()+"Answers:"+entry.getValue());
			
		}
	}

}
