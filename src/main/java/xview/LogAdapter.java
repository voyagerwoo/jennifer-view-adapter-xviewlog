package xview;

import com.jennifersoft.view.adapter.JenniferAdapter;
import com.jennifersoft.view.adapter.JenniferModel;
import com.jennifersoft.view.adapter.model.JenniferTransaction;
import com.jennifersoft.view.adapter.util.LogUtil;
import prop.LogProp;
import util.LogConfig;
import util.Logger;

import java.text.SimpleDateFormat;

public class LogAdapter implements JenniferAdapter {
    public void on(JenniferModel[] txlist) {
        LogProp prop = LogConfig.getLog();

        try {
            SimpleDateFormat sdf = new SimpleDateFormat(prop.getDateFormat());

            for(int i = 0; i < txlist.length; i++) {
                JenniferTransaction model = (JenniferTransaction) txlist[i];

                String pattern = prop.getPattern();
                String startTimeStr = sdf.format(model.getStartTime());
                String endTimeStr = sdf.format(model.getEndTime());
                String collectTimeStr = sdf.format(model.getCollectTime());

                pattern = pattern.replaceFirst("%startTime", startTimeStr);
                pattern = pattern.replaceFirst("%endTime", endTimeStr);
                pattern = pattern.replaceFirst("%collectTime", collectTimeStr);
                pattern = pattern.replaceFirst("%domainId", "" + model.getDomainId());
                pattern = pattern.replaceFirst("%domainName", "" + model.getDomainName());
                pattern = pattern.replaceFirst("%instanceId", "" + model.getInstanceId());
                pattern = pattern.replaceFirst("%instanceName", "" + model.getInstanceName());
                pattern = pattern.replaceFirst("%txid", "" + model.getTxid());
                pattern = pattern.replaceFirst("%clientIp", "" + model.getClientIp());
                pattern = pattern.replaceFirst("%clientId", "" + model.getClientId());
                pattern = pattern.replaceFirst("%userId", "" + model.getUserId());
                pattern = pattern.replaceFirst("%responseTime", "" + model.getResponseTime());
                pattern = pattern.replaceFirst("%frontendTime", "" + model.getFrontendTime());
                pattern = pattern.replaceFirst("%networkTime", "" + model.getNetworkTime());
                pattern = pattern.replaceFirst("%sqlTime", "" + model.getSqlTime());
                pattern = pattern.replaceFirst("%fetchTime", "" + model.getFetchTime());
                pattern = pattern.replaceFirst("%cpuTime", "" + model.getCpuTime());
                pattern = pattern.replaceFirst("%externalcallTime", "" + model.getExternalcallTime());
                pattern = pattern.replaceFirst("%error", "" + model.getErrorType());
                pattern = pattern.replaceFirst("%application", "" + model.getApplicationName());

                Logger.info(pattern);
            }
        } catch (Exception e) {
            LogUtil.error(e.toString());
        }
    }
}