package com.my.jenkinsdemo;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import com.offbytwo.jenkins.JenkinsServer;
import com.offbytwo.jenkins.model.Build;
import com.offbytwo.jenkins.model.BuildWithDetails;
import com.offbytwo.jenkins.model.Job;
import com.offbytwo.jenkins.model.JobWithDetails;
import com.sun.javafx.collections.MappingChange.Map;

public class App {

	public static void main(String[] args) throws URISyntaxException, IOException {
		// TODO Auto-generated method stub
		//https://www.jianshu.com/p/ae7e003dfb2c REST API
		//https://github.com/jenkinsci/java-client-api
		JenkinsServer jenkins = new JenkinsServer(new URI("http://localhost:8080"), "admin", "123456");
		
		String script = "node(){ \n"  +
				"echo 'hello world!' \n" +
				"}";
		//xml配置文件，且将脚本加入到配置中
		String xml = "<flow-definition plugin=\"workflow-job#2.32\">\n" + 
				"<description>测试项目</description>\n" +
				"<definition class=\"org.jenkinsci.plugins.workflow.cps.CpsFlowDefinition\" plugin=\"workflow-cps@2.66>\n" +
					"<script>" + script + "</script>\n"  +
					"<sandbox>true</sandbox>\n"  +	
					"</definition>" +
					"<flow-definition>";
		
		jenkins.createJob("JavaApiDemo", xml,true);
		
		//jenkins.getJob("MyDemo2").build(true);
		
		/*
		Map<String, Job> jobs = jenkins.getJobs();
		JobWithDetails job =jobs.get("MyDemo2").details();
		
		Build lastbuild = job.getLastBuild();
		
		BuildWithDetails buildDetails = lastbuild.details();
		
		if(buildDetails.isBuilding()){
			System.out.println("building");
		}else {
			System.out.println("not building");
		}
		System.out.println(lastbuild.getNumber());
		*/

	}

}
