package com.example.admin.pathmapper;

import java.util.List;

/**
 * 
 */
public class Path {
    private string _srcVertexId;
    private string _desVertexId;
    private List<Vertice> _pathDetail;

    public string getSrcVertexId() {
        return _srcVertexId;
    }

    public void setSrcVertexId(string _srcVertexId) {
        this._srcVertexId = _srcVertexId;
    }

    public string getDesVertexId() {
        return _desVertexId;
    }

    public void setDesVertexId(string _desVertexId) {
        this._desVertexId = _desVertexId;
    }

    public List<Vertice> getPathDetail() {
        return _pathDetail;
    }

    public void setPathDetail(List<Vertice> _pathDetail) {
        this._pathDetail = _pathDetail;
    }
}
