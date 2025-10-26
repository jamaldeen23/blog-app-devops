package com.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpSession;

@Controller
public class BlogController {
    
    @Autowired
    private BlogPostRepository blogPostRepository;
    
    @GetMapping("/")
    public String home(Model model, HttpSession session) {
        if (session.getAttribute("user") == null) {
            return "redirect:/login";
        }
        model.addAttribute("posts", blogPostRepository.findAllByOrderByCreatedAtDesc());
        model.addAttribute("username", ((User) session.getAttribute("user")).getUsername());
        return "index";
    }
    
    @GetMapping("/new")
    public String newPost(Model model, HttpSession session) {
        if (session.getAttribute("user") == null) {
            return "redirect:/login";
        }
        model.addAttribute("post", new BlogPost());
        return "new-post";
    }
    
    @PostMapping("/save")
    public String savePost(@ModelAttribute BlogPost post, HttpSession session) {
        if (session.getAttribute("user") == null) {
            return "redirect:/login";
        }
        blogPostRepository.save(post);
        return "redirect:/";
    }
    
    @GetMapping("/post/{id}")
    public String viewPost(@PathVariable Long id, Model model, HttpSession session) {
        if (session.getAttribute("user") == null) {
            return "redirect:/login";
        }
        BlogPost post = blogPostRepository.findById(id).orElse(null);
        model.addAttribute("post", post);
        return "view-post";
    }
}