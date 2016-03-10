package info.guardianproject.otr.app.im.app;

/**
 * Created by janki on 10/6/15.
 */

public class ServerData

    {
        private String port;

        private String cert;

        private String domain;

        public String getPort ()
        {
            return port;
        }

        public void setPort (String port)
        {
            this.port = port;
        }

        public String getCert ()
        {
            return cert;
        }

        public void setCert (String cert)
        {
            this.cert = cert;
        }

        public String getDomain ()
        {
            return domain;
        }

        public void setDomain (String domain)
        {
            this.domain = domain;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [port = "+port+", cert = "+cert+", domain = "+domain+"]";
        }
    }





