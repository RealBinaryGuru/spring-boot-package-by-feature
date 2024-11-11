package com.projectx.projectx.common.dto;

import org.springframework.data.domain.Page;

public class PaginationApiResponse<T> extends ApiResponse<T> {
    private int currentPage;
    private long totalItems;
    private int totalPages;

    public PaginationApiResponse(Page<T> page, String message) {
        super((T) page.getContent(), message); // Setting the content from the page
        this.currentPage = page.getNumber(); // Current page index (0-based)
        this.totalItems = page.getTotalElements(); // Total number of items
        this.totalPages = page.getTotalPages(); // Total number of pages
    }

    // Getters and Setters
    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public long getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(long totalItems) {
        this.totalItems = totalItems;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
