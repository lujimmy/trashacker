package org.trashacker.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author <a href="mailto:gn00023040@gmail.com">Jimmy Lu</a>
 * @since 15/5/22
 */
@Entity
@Table(name = "garbage_classification_instruction")
public class GarbageClssificationInstruction {

    @Id
    private int id;

    private String type;

    private String instruction;

    private String category;

    @Column(name = "sub_category")
    private String subCategory;

    private String keyword;

    @Column(name = "at_monday")
    private boolean atMonday;

    @Column(name = "at_tuesday")
    private boolean atTuesday;

    @Column(name = "at_wednesday")
    private boolean atWednesday;

    @Column(name = "at_thursday")
    private boolean atThursday;

    @Column(name = "at_friday")
    private boolean atFriday;

    @Column(name = "at_saturday")
    private boolean atSaturday;

    @Column(name = "at_sunday")
    private boolean atSunday;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public boolean isAtMonday() {
        return atMonday;
    }

    public void setAtMonday(boolean atMonday) {
        this.atMonday = atMonday;
    }

    public boolean isAtTuesday() {
        return atTuesday;
    }

    public void setAtTuesday(boolean atTuesday) {
        this.atTuesday = atTuesday;
    }

    public boolean isAtWednesday() {
        return atWednesday;
    }

    public void setAtWednesday(boolean atWednesday) {
        this.atWednesday = atWednesday;
    }

    public boolean isAtThursday() {
        return atThursday;
    }

    public void setAtThursday(boolean atThursday) {
        this.atThursday = atThursday;
    }

    public boolean isAtFriday() {
        return atFriday;
    }

    public void setAtFriday(boolean atFriday) {
        this.atFriday = atFriday;
    }

    public boolean isAtSaturday() {
        return atSaturday;
    }

    public void setAtSaturday(boolean atSaturday) {
        this.atSaturday = atSaturday;
    }

    public boolean isAtSunday() {
        return atSunday;
    }

    public void setAtSunday(boolean atSunday) {
        this.atSunday = atSunday;
    }
}
