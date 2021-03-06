package com.bakkentechnologies.authorization;

import java.util.List;
import org.apache.commons.lang.StringUtils;
import org.pac4j.core.authorization.authorizer.ProfileAuthorizer;
import org.pac4j.core.context.WebContext;
import org.pac4j.core.profile.CommonProfile;


public class Authorizer extends ProfileAuthorizer<CommonProfile> {
    @Override
    public boolean isAuthorized(final WebContext context, final List<CommonProfile> profiles) {
        return isAnyAuthorized(context, profiles);
    }

    @Override
    public boolean isProfileAuthorized(final WebContext context, final CommonProfile profile) {
        if (profile == null) {
            return false;
        }
        return StringUtils.startsWith(profile.getUsername(), "jle");
    }
}
