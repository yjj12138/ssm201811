package com.util;

import com.service.UserTbService;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("aaa")
public class LeaveBillTaskListener implements TaskListener {

    @Autowired
    private UserTbService userTbService;
    @Override
    public void notify(DelegateTask delegateTask) {
        //任务的执行人
        //当前登录用户
        System.out.println(userTbService);
       /* HttpSession session=((ServletRequestAttributes)
                   (RequestContextHolder.getRequestAttributes())).getRequest().getSession();
        System.out.println(session);
        UserTb users= (UserTb) session.getAttribute("u1");
        delegateTask.setAssignee(users.getManger().getUserName());*/
       delegateTask.setAssignee("user2");


    }
}
