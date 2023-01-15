package org.mql.java.application.models.primary;

import java.util.List;
import java.util.Vector;

import org.mql.java.application.models.Model;

public class PackageModel implements Model {

	private final String name;
	private List<ClassModel> classes;

	public PackageModel(String name) {
		this.name = name;
		this.classes = new Vector<>();
	}

	public String getName() {
		return name;
	}

	public List<ClassModel> getClasses() {
		return classes;
	}

	public void setClasses(List<ClassModel> classes) {
		this.classes = classes;
	}

	@Override
	public String toString() {
		return "PackageModel [name=" + name + ", classes=" + classes + "]";
	}
}
