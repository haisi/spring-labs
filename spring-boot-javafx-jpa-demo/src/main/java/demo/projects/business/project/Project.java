/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package demo.projects.business.project;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import demo.projects.business.task.Task;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Thomas Darimont
 */
@Data
@ToString(exclude = "tasks")
@Entity
@NoArgsConstructor
public class Project {

	@Id @GeneratedValue//
	private Long id;

	private String name;
	private String description;

	@OneToMany(mappedBy = "project")//
	private List<Task> tasks;

	public Project(String name) {
		this.name = name;
	}
}
