package com.yoyling;

import com.yoyling.domain.Category;
import com.yoyling.domain.Content;
import com.yoyling.domain.Tag;
import com.yoyling.domain.User;
import com.yoyling.service.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ServiceTest {
	@Test
	public void run1() {
		ApplicationContext ac = new
				ClassPathXmlApplicationContext("classpath:spring-context.xml");
		ContentService contentsService = (ContentService) ac.getBean("contentService");
		Content content = contentsService.selectByPrimaryKey(1);
		System.out.println(content);
	}

	@Test
	public void run2() {
		ApplicationContext ac = new
				ClassPathXmlApplicationContext("classpath:spring-context.xml");
		ContentService contentsService = (ContentService) ac.getBean("contentService");
		int n = contentsService.selectNumberOfArticles();
		System.out.println(n);
	}

	@Test
	public void run3() {
		ApplicationContext ac = new
				ClassPathXmlApplicationContext("classpath:spring-context.xml");
		ContentService contentsService = (ContentService) ac.getBean("contentService");
		List<Content> contents = contentsService.selectRecommendContent();
		for (Content c : contents) {
			System.out.println(c);
		}
	}

	@Test
	public void run4() {
		ApplicationContext ac = new
				ClassPathXmlApplicationContext("classpath:spring-context.xml");
		OptionsService optionsService = (OptionsService) ac.getBean("optionsService");
		String value = optionsService.selectValueByName("qq_link");
		System.out.println(value);
	}

	@Test
	public void run5() {
		ApplicationContext ac = new
				ClassPathXmlApplicationContext("classpath:spring-context.xml");
		CategoryService categoryService = (CategoryService) ac.getBean("categoryService");
		List<Category> categories = categoryService.selectAllCategory();
		for (Category c:categories) {
			System.out.println(c);
		}
	}

	@Test
	public void run6() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
		TagService tagService = (TagService) ac.getBean("tagService");
		List<Tag> tags = tagService.selectAllTag();
		for (Tag t:tags) {
			System.out.println(t);
		}
	}

	@Test
	public void run7() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
		TagService tagService = (TagService) ac.getBean("tagService");
		List<Tag> tags = tagService.fuzzyQueryTag("i");
		for (Tag t:tags) {
			System.out.println(t);
		}
	}

	@Test
	public void run8() {
		ApplicationContext ac = new
				ClassPathXmlApplicationContext("classpath:spring-context.xml");
		CategoryService categoryService = (CategoryService) ac.getBean("categoryService");
		int c = categoryService.selectCategoryBySlug("se");
		System.out.println(c);
	}

	@Test
	public void run9() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
		TagService tagService = (TagService) ac.getBean("tagService");
		int a = tagService.findTagIdByName("IO");
		System.out.println(a);
	}

	@Test
	public void run10() {
		ApplicationContext ac = new
				ClassPathXmlApplicationContext("classpath:spring-context.xml");
		ContentService contentsService = (ContentService) ac.getBean("contentService");
		Content content = contentsService.findContentBySlugName("ioc");
		System.out.println(content);
	}

	@Test
	public void run11() {
		ApplicationContext ac = new
				ClassPathXmlApplicationContext("classpath:spring-context.xml");
		UserService userService = (UserService) ac.getBean("userService");
		User t = new User();
		t.setName("yoyling");
		t.setPassword("yoyling");
		User user = userService.selectUserByNameAndPassword(t);
		System.out.println(user);
	}
}
