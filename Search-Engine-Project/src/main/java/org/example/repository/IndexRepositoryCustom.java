package org.example.repository;

import org.example.model.Index;

import java.util.List;

public interface IndexRepositoryCustom {
    void insertIndexList(String siteName, List<Index> indices);
}
