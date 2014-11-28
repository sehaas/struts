package org.apache.struts2;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.httpmethod.AllowedHttpMethod;
import org.apache.struts2.interceptor.httpmethod.HttpMethod;
import org.apache.struts2.interceptor.httpmethod.HttpMethodAware;

@AllowedHttpMethod(HttpMethod.POST)
public class HttpMethodsTestAction extends ActionSupport implements HttpMethodAware {

    private String resultName = null;

    public HttpMethodsTestAction() {
    }

    public HttpMethodsTestAction(String resultName) {
        this.resultName = resultName;
    }

    @AllowedHttpMethod(HttpMethod.GET)
    public String onGetOnly() {
        return "onGetOnly";
    }

    @AllowedHttpMethod(HttpMethod.POST)
    public String onPostOnly() {
        return "onPostOnly";
    }

    @AllowedHttpMethod({ HttpMethod.GET, HttpMethod.POST })
    public String onGetPostOnly() {
        return "onGetPostOnly";
    }

    @AllowedHttpMethod({ HttpMethod.PUT, HttpMethod.POST })
    public String onPutOrPost() {
        return "onPutOrPost";
    }

    @AllowedHttpMethod(HttpMethod.DELETE)
    public String onDelete() {
        return "onDelete";
    }

    public void setMethod(HttpMethod httpMethod) {

    }

    public String getBadRequestResultName() {
        return resultName;
    }
}
