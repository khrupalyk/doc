/**
 * Created by Khrupalyk on 9/28/15.
 */

var Doctor = React.createClass({

    render: function () {

        var doctor = this.props.doctor;

        return (<div> Doctor name:  {doctor.name} </div>);
    }

});