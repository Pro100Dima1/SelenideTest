package org.example.practiceForm.pages.components;

import static com.codeborne.selenide.Selenide.$;

public class ComponentCalendar {
    public void setDate(String day, String month, String year) {
        $("select[class='react-datepicker__month-select']").selectOption(month);
        $("select[class='react-datepicker__year-select']").selectOption(year);
        $("div[class = 'react-datepicker__day react-datepicker__day--0" + day + "']").click();
    }
}
