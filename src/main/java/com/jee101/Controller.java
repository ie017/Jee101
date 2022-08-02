package com.jee101;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class Controller {
    public abstract void execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
