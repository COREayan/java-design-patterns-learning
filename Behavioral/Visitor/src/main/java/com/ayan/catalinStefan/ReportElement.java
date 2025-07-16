package com.ayan.catalinStefan;

public interface ReportElement {
    <R> R accept(ReportVisitor<R> visitor);
}
