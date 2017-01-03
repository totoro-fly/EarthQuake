package com.totoro_fly.earthquake;

import java.util.List;

/**
 * Created by totoro-fly on 2017/1/2.
 */

public class EarthquakeJson {


    /**
     * type : FeatureCollection
     * metadata : {"generated":1483341869000,"url":"http://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2016-01-01&endtime=2016-01-31&minmag=6&limit=10","title":"USGS Earthquakes","status":200,"api":"1.5.2","limit":10,"offset":1,"count":10}
     * features : [{"type":"Feature","properties":{"mag":7.2,"place":"88km N of Yelizovo, Russia","time":1454124312220,"updated":1478815834700,"tz":720,"url":"http://earthquake.usgs.gov/earthquakes/eventpage/us20004vvx","detail":"http://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us20004vvx&format=geojson","felt":2,"cdi":3.4,"mmi":5.82,"alert":"green","status":"reviewed","tsunami":1,"sig":798,"net":"us","code":"20004vvx","ids":",gcmt20160130032510,at00o1qxho,pt16030050,us20004vvx,gcmt20160130032512,","sources":",gcmt,at,pt,us,gcmt,","types":",associate,cap,dyfi,finite-fault,general-link,general-text,geoserve,impact-link,impact-text,losspager,moment-tensor,nearby-cities,origin,phase-data,shakemap,tectonic-summary,","nst":null,"dmin":0.958,"rms":1.19,"gap":17,"magType":"mww","type":"earthquake","title":"M 7.2 - 88km N of Yelizovo, Russia"},"geometry":{"type":"Point","coordinates":[158.5463,53.9776,177]},"id":"us20004vvx"},{"type":"Feature","properties":{"mag":6.1,"place":"94km SSE of Taron, Papua New Guinea","time":1453777820750,"updated":1478815803221,"tz":600,"url":"http://earthquake.usgs.gov/earthquakes/eventpage/us20004uks","detail":"http://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us20004uks&format=geojson","felt":null,"cdi":null,"mmi":4.1,"alert":"green","status":"reviewed","tsunami":1,"sig":572,"net":"us","code":"20004uks","ids":",gcmt20160126031023,us20004uks,gcmt20160126031020,","sources":",gcmt,us,gcmt,","types":",associate,cap,geoserve,losspager,moment-tensor,nearby-cities,origin,phase-data,shakemap,tectonic-summary,","nst":null,"dmin":1.537,"rms":0.74,"gap":25,"magType":"mww","type":"earthquake","title":"M 6.1 - 94km SSE of Taron, Papua New Guinea"},"geometry":{"type":"Point","coordinates":[153.2454,-5.2952,26]},"id":"us20004uks"},{"type":"Feature","properties":{"mag":6.3,"place":"50km NNE of Al Hoceima, Morocco","time":1453695722730,"updated":1478815788032,"tz":0,"url":"http://earthquake.usgs.gov/earthquakes/eventpage/us10004gy9","detail":"http://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us10004gy9&format=geojson","felt":117,"cdi":7.2,"mmi":5.28,"alert":"green","status":"reviewed","tsunami":0,"sig":695,"net":"us","code":"10004gy9","ids":",gcmt20160125042203,us10004gy9,gcmt20160125042202,","sources":",gcmt,us,gcmt,","types":",associate,cap,dyfi,geoserve,impact-text,losspager,moment-tensor,nearby-cities,origin,phase-data,shakemap,tectonic-summary,","nst":null,"dmin":2.201,"rms":0.92,"gap":20,"magType":"mww","type":"earthquake","title":"M 6.3 - 50km NNE of Al Hoceima, Morocco"},"geometry":{"type":"Point","coordinates":[-3.6818,35.6493,12]},"id":"us10004gy9"},{"type":"Feature","properties":{"mag":7.1,"place":"86km E of Old Iliamna, Alaska","time":1453631430230,"updated":1478815782468,"tz":-540,"url":"http://earthquake.usgs.gov/earthquakes/eventpage/us10004gqp","detail":"http://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us10004gqp&format=geojson","felt":1816,"cdi":7.2,"mmi":6.6,"alert":"green","status":"reviewed","tsunami":1,"sig":1496,"net":"us","code":"10004gqp","ids":",at00o1gd6r,us10004gqp,ak12496371,gcmt20160124103030,","sources":",at,us,ak,gcmt,","types":",cap,dyfi,finite-fault,general-link,general-text,geoserve,impact-link,impact-text,losspager,moment-tensor,nearby-cities,origin,phase-data,shakemap,tectonic-summary,trump-origin,","nst":null,"dmin":0.72,"rms":2.11,"gap":19,"magType":"mww","type":"earthquake","title":"M 7.1 - 86km E of Old Iliamna, Alaska"},"geometry":{"type":"Point","coordinates":[-153.4051,59.6363,129]},"id":"us10004gqp"},{"type":"Feature","properties":{"mag":6.6,"place":"215km SW of Tomatlan, Mexico","time":1453399617650,"updated":1478815764127,"tz":-420,"url":"http://earthquake.usgs.gov/earthquakes/eventpage/us10004g4l","detail":"http://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us10004g4l&format=geojson","felt":11,"cdi":2.7,"mmi":3.92,"alert":"green","status":"reviewed","tsunami":1,"sig":673,"net":"us","code":"10004g4l","ids":",gcmt20160121180659,at00o1bebo,pt16021050,us10004g4l,gcmt20160121180657,","sources":",gcmt,at,pt,us,gcmt,","types":",associate,cap,dyfi,geoserve,impact-link,impact-text,losspager,moment-tensor,nearby-cities,origin,phase-data,shakemap,tectonic-summary,","nst":null,"dmin":2.413,"rms":0.98,"gap":74,"magType":"mww","type":"earthquake","title":"M 6.6 - 215km SW of Tomatlan, Mexico"},"geometry":{"type":"Point","coordinates":[-106.9337,18.8239,10]},"id":"us10004g4l"},{"type":"Feature","properties":{"mag":6.7,"place":"52km SE of Shizunai, Japan","time":1452741933640,"updated":1478815700277,"tz":540,"url":"http://earthquake.usgs.gov/earthquakes/eventpage/us10004ebx","detail":"http://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us10004ebx&format=geojson","felt":51,"cdi":5.8,"mmi":6.45,"alert":"green","status":"reviewed","tsunami":1,"sig":720,"net":"us","code":"10004ebx","ids":",us10004ebx,gcmt20160114032534,pt16014050,at00o0xauk,gcmt20160114032533,","sources":",us,gcmt,pt,at,gcmt,","types":",associate,cap,dyfi,geoserve,impact-link,impact-text,losspager,moment-tensor,nearby-cities,origin,phase-data,shakemap,","nst":null,"dmin":0.281,"rms":0.98,"gap":22,"magType":"mww","type":"earthquake","title":"M 6.7 - 52km SE of Shizunai, Japan"},"geometry":{"type":"Point","coordinates":[142.781,41.9723,46]},"id":"us10004ebx"},{"type":"Feature","properties":{"mag":6.1,"place":"12km WNW of Charagua, Bolivia","time":1452741928270,"updated":1478815697357,"tz":-240,"url":"http://earthquake.usgs.gov/earthquakes/eventpage/us10004ebw","detail":"http://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us10004ebw&format=geojson","felt":3,"cdi":2.2,"mmi":2.21,"alert":"green","status":"reviewed","tsunami":0,"sig":573,"net":"us","code":"10004ebw","ids":",us10004ebw,gcmt20160114032528,","sources":",us,gcmt,","types":",cap,dyfi,geoserve,impact-text,losspager,moment-tensor,nearby-cities,origin,phase-data,shakemap,tectonic-summary,","nst":null,"dmin":5.492,"rms":1.04,"gap":16,"magType":"mww","type":"earthquake","title":"M 6.1 - 12km WNW of Charagua, Bolivia"},"geometry":{"type":"Point","coordinates":[-63.3288,-19.7597,582.56]},"id":"us10004ebw"},{"type":"Feature","properties":{"mag":6.2,"place":"74km NW of Rumoi, Japan","time":1452532083920,"updated":1478815677682,"tz":540,"url":"http://earthquake.usgs.gov/earthquakes/eventpage/us10004djn","detail":"http://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us10004djn&format=geojson","felt":8,"cdi":3.4,"mmi":3.74,"alert":"green","status":"reviewed","tsunami":0,"sig":594,"net":"us","code":"10004djn","ids":",us10004djn,gcmt20160111170803,","sources":",us,gcmt,","types":",cap,dyfi,geoserve,impact-text,losspager,moment-tensor,nearby-cities,origin,phase-data,shakemap,tectonic-summary,","nst":null,"dmin":1.139,"rms":0.96,"gap":33,"magType":"mww","type":"earthquake","title":"M 6.2 - 74km NW of Rumoi, Japan"},"geometry":{"type":"Point","coordinates":[141.0867,44.4761,238.81]},"id":"us10004djn"},{"type":"Feature","properties":{"mag":6.5,"place":"227km SE of Sarangani, Philippines","time":1452530285900,"updated":1478815676075,"tz":480,"url":"http://earthquake.usgs.gov/earthquakes/eventpage/us10004dj5","detail":"http://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us10004dj5&format=geojson","felt":1,"cdi":2.7,"mmi":7.5,"alert":"green","status":"reviewed","tsunami":1,"sig":650,"net":"us","code":"10004dj5","ids":",gcmt20160111163807,at00o0srjp,pt16011050,us10004dj5,gcmt20160111163805,","sources":",gcmt,at,pt,us,gcmt,","types":",associate,cap,dyfi,geoserve,impact-link,impact-text,losspager,moment-tensor,nearby-cities,origin,phase-data,shakemap,tectonic-summary,","nst":null,"dmin":3.144,"rms":0.72,"gap":22,"magType":"mww","type":"earthquake","title":"M 6.5 - 227km SE of Sarangani, Philippines"},"geometry":{"type":"Point","coordinates":[126.8621,3.8965,13]},"id":"us10004dj5"},{"type":"Feature","properties":{"mag":6,"place":"Pacific-Antarctic Ridge","time":1451986454620,"updated":1478815631921,"tz":-540,"url":"http://earthquake.usgs.gov/earthquakes/eventpage/us10004bgk","detail":"http://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us10004bgk&format=geojson","felt":0,"cdi":1,"mmi":0,"alert":"green","status":"reviewed","tsunami":0,"sig":554,"net":"us","code":"10004bgk","ids":",gcmt20160105093415,us10004bgk,gcmt20160105093414,","sources":",gcmt,us,gcmt,","types":",associate,cap,dyfi,geoserve,losspager,moment-tensor,nearby-cities,origin,phase-data,shakemap,","nst":null,"dmin":30.75,"rms":0.67,"gap":71,"magType":"mww","type":"earthquake","title":"M 6.0 - Pacific-Antarctic Ridge"},"geometry":{"type":"Point","coordinates":[-136.2603,-54.2906,10]},"id":"us10004bgk"}]
     * bbox : [-153.4051,-54.2906,10,158.5463,59.6363,582.56]
     */

    private String type;
    private MetadataBean metadata;
    private List<FeaturesBean> features;
    private List<Double> bbox;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MetadataBean getMetadata() {
        return metadata;
    }

    public void setMetadata(MetadataBean metadata) {
        this.metadata = metadata;
    }

    public List<FeaturesBean> getFeatures() {
        return features;
    }

    public void setFeatures(List<FeaturesBean> features) {
        this.features = features;
    }

    public List<Double> getBbox() {
        return bbox;
    }

    public void setBbox(List<Double> bbox) {
        this.bbox = bbox;
    }

    public static class MetadataBean {
        /**
         * generated : 1483341869000
         * url : http://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2016-01-01&endtime=2016-01-31&minmag=6&limit=10
         * title : USGS Earthquakes
         * status : 200
         * api : 1.5.2
         * limit : 10
         * offset : 1
         * count : 10
         */

        private long generated;
        private String url;
        private String title;
        private int status;
        private String api;
        private int limit;
        private int offset;
        private int count;

        public long getGenerated() {
            return generated;
        }

        public void setGenerated(long generated) {
            this.generated = generated;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getApi() {
            return api;
        }

        public void setApi(String api) {
            this.api = api;
        }

        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }

    public static class FeaturesBean {
        /**
         * type : Feature
         * properties : {"mag":7.2,"place":"88km N of Yelizovo, Russia","time":1454124312220,"updated":1478815834700,"tz":720,"url":"http://earthquake.usgs.gov/earthquakes/eventpage/us20004vvx","detail":"http://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us20004vvx&format=geojson","felt":2,"cdi":3.4,"mmi":5.82,"alert":"green","status":"reviewed","tsunami":1,"sig":798,"net":"us","code":"20004vvx","ids":",gcmt20160130032510,at00o1qxho,pt16030050,us20004vvx,gcmt20160130032512,","sources":",gcmt,at,pt,us,gcmt,","types":",associate,cap,dyfi,finite-fault,general-link,general-text,geoserve,impact-link,impact-text,losspager,moment-tensor,nearby-cities,origin,phase-data,shakemap,tectonic-summary,","nst":null,"dmin":0.958,"rms":1.19,"gap":17,"magType":"mww","type":"earthquake","title":"M 7.2 - 88km N of Yelizovo, Russia"}
         * geometry : {"type":"Point","coordinates":[158.5463,53.9776,177]}
         * id : us20004vvx
         */

        private String type;
        private PropertiesBean properties;
        private GeometryBean geometry;
        private String id;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public PropertiesBean getProperties() {
            return properties;
        }

        public void setProperties(PropertiesBean properties) {
            this.properties = properties;
        }

        public GeometryBean getGeometry() {
            return geometry;
        }

        public void setGeometry(GeometryBean geometry) {
            this.geometry = geometry;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class PropertiesBean {
            /**
             * mag : 7.2
             * place : 88km N of Yelizovo, Russia
             * time : 1454124312220
             * updated : 1478815834700
             * tz : 720
             * url : http://earthquake.usgs.gov/earthquakes/eventpage/us20004vvx
             * detail : http://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us20004vvx&format=geojson
             * felt : 2
             * cdi : 3.4
             * mmi : 5.82
             * alert : green
             * status : reviewed
             * tsunami : 1
             * sig : 798
             * net : us
             * code : 20004vvx
             * ids : ,gcmt20160130032510,at00o1qxho,pt16030050,us20004vvx,gcmt20160130032512,
             * sources : ,gcmt,at,pt,us,gcmt,
             * types : ,associate,cap,dyfi,finite-fault,general-link,general-text,geoserve,impact-link,impact-text,losspager,moment-tensor,nearby-cities,origin,phase-data,shakemap,tectonic-summary,
             * nst : null
             * dmin : 0.958
             * rms : 1.19
             * gap : 17
             * magType : mww
             * type : earthquake
             * title : M 7.2 - 88km N of Yelizovo, Russia
             */

            private double mag;
            private String place;
            private long time;
            private long updated;
            private int tz;
            private String url;
            private String detail;
            private int felt;
            private double cdi;
            private double mmi;
            private String alert;
            private String status;
            private int tsunami;
            private int sig;
            private String net;
            private String code;
            private String ids;
            private String sources;
            private String types;
            private Object nst;
            private double dmin;
            private double rms;
            private int gap;
            private String magType;
            private String type;
            private String title;

            public double getMag() {
                return mag;
            }

            public void setMag(double mag) {
                this.mag = mag;
            }

            public String getPlace() {
                return place;
            }

            public void setPlace(String place) {
                this.place = place;
            }

            public long getTime() {
                return time;
            }

            public void setTime(long time) {
                this.time = time;
            }

            public long getUpdated() {
                return updated;
            }

            public void setUpdated(long updated) {
                this.updated = updated;
            }

            public int getTz() {
                return tz;
            }

            public void setTz(int tz) {
                this.tz = tz;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getDetail() {
                return detail;
            }

            public void setDetail(String detail) {
                this.detail = detail;
            }

            public int getFelt() {
                return felt;
            }

            public void setFelt(int felt) {
                this.felt = felt;
            }

            public double getCdi() {
                return cdi;
            }

            public void setCdi(double cdi) {
                this.cdi = cdi;
            }

            public double getMmi() {
                return mmi;
            }

            public void setMmi(double mmi) {
                this.mmi = mmi;
            }

            public String getAlert() {
                return alert;
            }

            public void setAlert(String alert) {
                this.alert = alert;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public int getTsunami() {
                return tsunami;
            }

            public void setTsunami(int tsunami) {
                this.tsunami = tsunami;
            }

            public int getSig() {
                return sig;
            }

            public void setSig(int sig) {
                this.sig = sig;
            }

            public String getNet() {
                return net;
            }

            public void setNet(String net) {
                this.net = net;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getIds() {
                return ids;
            }

            public void setIds(String ids) {
                this.ids = ids;
            }

            public String getSources() {
                return sources;
            }

            public void setSources(String sources) {
                this.sources = sources;
            }

            public String getTypes() {
                return types;
            }

            public void setTypes(String types) {
                this.types = types;
            }

            public Object getNst() {
                return nst;
            }

            public void setNst(Object nst) {
                this.nst = nst;
            }

            public double getDmin() {
                return dmin;
            }

            public void setDmin(double dmin) {
                this.dmin = dmin;
            }

            public double getRms() {
                return rms;
            }

            public void setRms(double rms) {
                this.rms = rms;
            }

            public int getGap() {
                return gap;
            }

            public void setGap(int gap) {
                this.gap = gap;
            }

            public String getMagType() {
                return magType;
            }

            public void setMagType(String magType) {
                this.magType = magType;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }

        public static class GeometryBean {
            /**
             * type : Point
             * coordinates : [158.5463,53.9776,177]
             */

            private String type;
            private List<Double> coordinates;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public List<Double> getCoordinates() {
                return coordinates;
            }

            public void setCoordinates(List<Double> coordinates) {
                this.coordinates = coordinates;
            }
        }
    }
}