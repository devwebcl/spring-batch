package cl.devweb.util;

public enum JobEnum {

    CITIES("job-migration-cities", "cityJob"),
    MERCHANTS("job-migration-merchants", "merchantJob"),
    DEALRUN("job-migration-deals", "migrationDealRunJob"),
    DEALTEMPLATE("job-migration-deals", "migrationDealTemplateJob"),
    DEALRUNOPTIONS("job-migration-deals", "migrationDealTemplateOptionsJob"),
    DEALTEMPLATEOPTIONS("job-migration-deals", "migrationDealTemplateOptionsJob"),
    ORDERS("job-migration-orders", "migrationJob"),
    CITYDEALS("job-migration-citydeals", "migrationCityDealsJob"),
    USERS("job-migration-users", "userJob"),;

    private final String fileName;
    private final String jobBean;

    JobEnum(String fileName, String jobBean) {
        this.fileName = fileName;
        this.jobBean = jobBean;
    }

    public String getFileName() {
        return fileName;
    }

    public String getJobBean() {
        return jobBean;
    }

    public static JobEnum getByName(String jobName) {
        if (jobName != null) {
            return JobEnum.valueOf(jobName.toUpperCase());
        } else {
            return null;
        }
    }

}
